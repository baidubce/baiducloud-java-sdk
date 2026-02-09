# Overview

This document introduces the Baidu Cloud Java SDK, which enables developers to integrate various Baidu Cloud products using the Java programming language (see Supported Products List for details).
The SDK encapsulates convenient calling interfaces, maintains similar usage patterns and calling interfaces across multiple programming language versions, and provides unified error codes and return formats to facilitate debugging.

## Installing the SDK

### Runtime Environment

The Java SDK can run in Java 1.8 environments.

### Prerequisites

[**AK/SK**](https://cloud.baidu.com/doc/Reference/s/9jwvz2egb): Authentication with the SDK requires passing AK/SK parameters. You can obtain your Access Key and Secret Key from the [Security Authentication page](https://console.bce.baidu.com/iam/#/iam/accesslist).

Users can interact with Baidu Cloud through two methods: authenticated and anonymous. For authenticated access, the Access Key / Secret Key encryption method is used to verify the sender's identity. The Access Key (AK) identifies the user, while the Secret Key (SK) is used to encrypt the authentication string. Baidu Cloud uses the SK to verify the authentication string. The SK must be kept confidential and should only be known to the user and Baidu Cloud.

### Installing the SDK

**Using Maven**

Add the bce-java-sdk dependency to your Maven pom.xml file:

```xml
<dependency>
    <groupId>com.baidubce</groupId>
    <artifactId>baiducloud-java-sdk</artifactId>
    <version>{version}</version>
</dependency>
```

**SDK Directory Structure**

```text
baiducloud-java-sdk
├── baiducloud-java-sdk-core                  //BCE signature, HTTP, and internal tools module
├──├──src/main/java/com.baidubce
├──├──├──auth                                      //BCE signature related classes
├──├──├──http                                      //BCE HTTP communication related classes
├──├──├──internal                                  //SDK internal classes
├──├──├──model                                     //BCE common model classes
├──├──├──util                                      //BCE common utility classes
├──├──├──BceClientConfiguration.class              //Configuration for BCE HttpClient
├──├──├──BceClientException.class                  //BCE client exception class
├──├──├──BceServiceException.class                 //Exception class for BCE service interactions
├──├──├──ErrorCode.class                           //BCE common error codes
└──├──├──Region.class                              //BCE service regions
├── baiducloud-java-sdk-{product}                      //Product module
├──├──src/main/java/com.baidubce.{product}
├──├──├──models                                    //Product classes
├──├──├──sample                                    //Product sample code
├──├──├──{product}Client.java                          //Client calls
```

### Uninstalling the SDK

To uninstall the SDK, simply delete the downloaded source code.

## Quick Start

### Confirming the Endpoint

Before using the SDK, you need to confirm the Endpoint (service domain) of the Baidu Cloud product you will access. For example, for the Baidu Cloud VPC product, you can read the [VPC Access Domain](https://cloud.baidu.com/doc/VPC/s/xjwvyuhpw) section to understand Endpoint-related concepts. Other services are similar - you need to understand and confirm the corresponding service's Endpoint.

### Creating a Client Object

Each specific service has a `Client` object that encapsulates a series of easy-to-use methods for developers to interact with the corresponding service.

### Calling Functional Interfaces

Based on the created `Client` object for the corresponding service, developers can call the relevant functional interfaces to use Baidu Cloud product features.

### Example

Below is a basic usage example using Baidu Cloud VPC (Virtual Private Cloud). For detailed usage instructions, please refer to the detailed documentation for each service.

```java
public class ExampleCreateVpc {
    public static void main(String[] args) {
        // Set the Client's Access Key ID and Secret Access Key. For AKSK details, see: https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        VpcClient client = new VpcClient(config);
        CreateVpcRequest createVpcRequest = new CreateVpcRequest();
        createVpcRequest.setClientToken("");
        createVpcRequest.setName("");
        createVpcRequest.setDescription("");
        createVpcRequest.setCidr("");
        createVpcRequest.setEnableIpv6(false);
        createVpcRequest.setTags(new ArrayList<>());
        try {
            CreateVpcResponse response = client.createVpc(createVpcRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

In the code above, the variables `AK` and `SK` are assigned by the system to users. Both are strings used to identify users and sign verification for accessing VPC. `AK` corresponds to "Access Key ID" in the console, and `SK` corresponds to "Access Key Secret" in the console. For instructions on obtaining these, please refer to the Operations Guide [Obtaining ACCESS KEY](https://cloud.baidu.com/doc/Reference/s/9jwvz2egb).

The above method uses the default domain as the VPC service address. If users need to specify their own domain, they can pass an ENDPOINT parameter.

```java
String ak = <your-access-key-id>;               // User's Access Key ID
String sk = <your-secret-access-key>;           // User's Secret Access Key
String endpoint = <domain-name>;                // User-specified domain name

BceClientConfiguration config = new BceClientConfiguration();
config.setCredentials(new DefaultBceCredentials(ak, sk));
config.setEndpoint(endpoint);
VpcClient client = new VpcClient(config);
```

> **Note:** The ENDPOINT parameter can only be defined using specified domains that include regions. Baidu Cloud currently supports multiple regions. Please refer to the [Region Selection Guide](https://cloud.baidu.com/doc/Reference/s/2jwvz23xx).

## Configuration

### Using HTTPS Protocol

The SDK supports accessing Baidu Cloud service products using the HTTPS protocol. You can use HTTPS to access VPC services in the VPC Java SDK through the following two methods:

- Specify https in the endpoint:

```java
String ak = "ak";
String sk = "sk";
String endpoint = "https://bcc.bj.baidubce.com";
BceClientConfiguration config = new BceClientConfiguration();
config.setCredentials(new DefaultBceCredentials(ak, sk));
config.setEndpoint(endpoint);
VpcClient client = new VpcClient(config);
```

- Set the https protocol by calling the setProtocol method:

```java
String endpoint = "bcc.bj.baidubce.com"; // endpoint does not include protocol
String ak = "ak";
String sk = "sk";
BceClientConfiguration config = new BceClientConfiguration();
config.setCredentials(new DefaultBceCredentials(ak, sk));
config.setEndpoint(endpoint);
config.setProtocol(Protocol.HTTPS); // If not specified, HTTP is used
VpcClient client = new VpcClient(config);
```

> Note: If the protocol is specified in the endpoint, the endpoint setting takes effect, and calling setProtocol() separately will have no effect.

```java
String endpoint = "http://bcc.bj.baidubce.com";
String ak = "ak";
String sk = "sk";
BceClientConfiguration config = new BceClientConfiguration();
config.setCredentials(new DefaultBceCredentials(ak, sk));
config.setEndpoint(endpoint);    
config.setProtocol(Protocol.HTTPS); // Invalid operation since protocol is already specified in endpoint; same for HTTP
VpcClient client = new VpcClient(config);
```

### Configuring VpcClient

If users need to configure some detailed parameters of VpcClient, they can pass a BceClientConfiguration object when constructing the VpcClient. BceClientConfiguration is a common configuration class for services that can configure proxies, maximum connections, and other parameters for the client.

### Using a Proxy

The following code allows the client to access the VPC service using a proxy:

```java
String ak = <your-access-key-id>;               // User's Access Key ID
String sk = <your-secret-access-key>;           // User's Secret Access Key
String endpoint = <domain-name>;                // User-specified domain name

// Create BceClientConfiguration instance
BceClientConfiguration config = new BceClientConfiguration();

// Configure proxy to local port 8080
config.setProxyHost("127.0.0.1");
config.setProxyPort(8080);

// Create VPC client
config.setCredentials(new DefaultBceCredentials(ak, sk));
config.setEndpoint(endpoint);
VpcClient client = new VpcClient(config);
```

Using the code above, all client operations will be proxied through port 8080 at address 127.0.0.1. For proxies requiring user authentication, you can configure the username and password with the following code:

```java
// Create BceClientConfiguration instance
BceClientConfiguration config = new BceClientConfiguration();

// Configure proxy to local port 8080
config.setProxyHost("127.0.0.1");
config.setProxyPort(8080);

// Set username and password
config.setProxyUsername(<username>);                             // Username
config.setProxyPassword(<password>);                             // Password
```

### Setting Network Parameters

Users can set basic network parameters using BceClientConfiguration:

```java
BceClientConfiguration config = new BceClientConfiguration();

// Set maximum HTTP connections to 10
config.setMaxConnections(10);

// Set TCP connection timeout to 5000 milliseconds
config.setConnectionTimeout(5000);

// Set socket data transfer timeout to 2000 milliseconds
config.setSocketTimeout(2000);
```

**Parameter Description**

All parameters that can be specified through BceClientConfiguration are shown in the table below:

| Parameter                                | Description                                                     |
| ---------------------------------------- | --------------------------------------------------------------- |
| UserAgent                                | User agent, specifies the HTTP User-Agent header                |
| Protocol                                 | Connection protocol type                                        |
| ProxyDomain                              | Windows domain name for NTLM proxy server authentication        |
| ProxyHost                                | Proxy server host address                                       |
| ProxyPort                                | Proxy server port                                               |
| ProxyUsername                            | Proxy server authentication username                            |
| ProxyPassword                            | Proxy server authentication password                            |
| ProxyPreemptiveAuthenticationEnabled     | Whether to enable user proxy authentication                     |
| ProxyWorkstation                         | Windows workstation name for NTLM proxy server                  |
| LocalAddress                             | Local address                                                   |
| ConnectionTimeoutInMillis                | Connection establishment timeout (in milliseconds)              |
| SocketTimeoutInMillis                    | Data transfer timeout through an open connection (in milliseconds) |
| MaxConnections                           | Maximum number of HTTP connections allowed                      |
| RetryPolicy                              | Connection retry policy                                         |
| SocketBufferSizeInBytes                  | Socket buffer size                                              |
| StreamBufferSize                         | Stream file buffer size                                         |

## Error Handling

Exceptions are indicated in two ways:

| Exception Method   | Description       |
| ------------------ | ----------------- |
| BceClientException | Client exception  |
| BceServerException | Server exception  |

Users can use try-catch to capture exceptions generated by an event, for example:

```java
try {
    CreateVpcResponse response = client.createVpc(createVpcRequest);
    System.out.println(response.toJsonString());
} catch (BceServiceException bce){
    System.out.println(bce.getMessage());
} catch (BceClientException bce){
    System.out.println(bce.getMessage());
}
```

### SDK Logging

The VPC Java SDK release includes logback as the slf4j implementation. Users can use it directly if they don't have their own implementation. If your project uses another implementation such as log4j, it can be substituted.

### Default Logging

If users use the default logback, they need to configure logback.xml in the classpath. Without this configuration file, the default log level is DEBUG.

```xml
<configuration>
    <property name="LOG_HOME" value="./log/"/>
    <appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
        <!-- encoders are assigned the type
             ch.qos.logback.classic.encoder.PatternLayoutEncoder by default -->
        <encoder>
            <pattern>%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n</pattern>
        </encoder>
    </appender>

    <appender name="FILE" class="ch.qos.logback.core.rolling.RollingFileAppender">
        <rollingPolicy class="ch.qos.logback.core.rolling.TimeBasedRollingPolicy">
            <FileNamePattern>${LOG_HOME}/VpcUnitTest.%d{yyyy-MM-dd}.log</FileNamePattern>
            <MaxHistory>30</MaxHistory>
        </rollingPolicy>
        <encoder class="ch.qos.logback.classic.encoder.PatternLayoutEncoder">
            <pattern>%d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] %-5level %logger{50} - %msg%n</pattern>
        </encoder>
        <triggeringPolicy class="ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy">
            <MaxFileSize>10MB</MaxFileSize>
        </triggeringPolicy>
    </appender>

    <root level="info">
        <appender-ref ref="STDOUT"/>
        <appender-ref ref="FILE"/>
    </root>
</configuration>
```

### Custom Logging Module

If users want to use their own logging implementation module, for example if the project depends on Maven, you can add configuration similar to the following in pom.xml to exclude logback:

```xml
<?xml version="1.0" encoding="utf-8"?>

<dependency>      
  <groupId>com.baidubce</groupId>      
  <artifactId>baiducloud-java-sdk</artifactId>      
  <version>${bce.sdk.version}</version>      
  <exclusions>        
    <exclusion>          
      <groupId>ch.qos.logback</groupId>          
      <artifactId>logback-classic</artifactId>        
    </exclusion>        
    <exclusion>          
      <groupId>ch.qos.logback</groupId>          
      <artifactId>logback-core</artifactId>        
    </exclusion>        
    <exclusion>          
      <groupId>org.slf4j</groupId>          
      <artifactId>jcl-over-slf4j</artifactId>        
    </exclusion>      
  </exclusions>    
</dependency>
```

## Testing

Refer to **Quick Start** and use your own AK and SK for testing.

## Discussion

https://github.com/baidubce/baiducloud-java-sdk/issues