#!/bin/bash
export GEOMETRY="2880""x""1800""x""24"
xvfb-run -a --server-args="-screen 0 $GEOMETRY -ac +extension RANDR" mvn test