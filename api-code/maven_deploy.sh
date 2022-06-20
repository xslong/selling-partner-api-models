#!/bin/bash

mvn deploy -DskipTests  -Dmaven.javadoc.skip=true
echo 'SUCCESS'