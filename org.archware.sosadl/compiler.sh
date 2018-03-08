#!/bin/sh

find src src-emf src-gen xtend-gen -name '*.java' -print0 | xargs -0 javac "$@"

