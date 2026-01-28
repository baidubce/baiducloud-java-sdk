#!/usr/bin/env bash

# Be sure your script exit whenever encounter errors
set -e

mvn -U clean deploy -Prelease

./postBuild.sh
