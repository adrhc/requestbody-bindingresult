#!/bin/bash
if [ -e "env.sh" ]; then
	source env.sh
elif [ -e mvnw ]; then
	echo "env.sh missing, using ./mvnw"
	MVN="./mvnw"
else
	echo "env.sh missing, using mvn"
	MVN="mvn"
fi

# these require <forkCount> usage:
# ./test-report-only.sh -P db-off	-> equivalent to in-memory-only
# ./test-report-only.sh -P db-on
#
# these does not require <forkCount> usage:
# ./test-report-only.sh -P staging-only
# ./test-report-only.sh -P production-only
$MVN -e surefire-report:report-only
