very simple class to show how property based testing with *jqwik* work

you need to run this with **JUNIT5**

run
```
mvn clean test
```
to get the output
```
[INFO] --- maven-surefire-plugin:2.19:test (default-test) @ property-based-testing ---

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.test.MyPropertyBasedTest
16 [100441793, 615162271, -331, -961110051, 1708897760, 893268611, -127, -342, -6, -1612603718, -753188528, 1745402596, -1341595902, 1990692024, -144019311, -47]
9 [100441793, 615162271, -331, -961110051, 1708897760, 893268611, -127, -342, -6]
9 [-342, -6, -1612603718, -753188528, 1745402596, -1341595902, 1990692024, -144019311, -47]
8 [615162271, -331, -961110051, 1708897760, 893268611, -127, -342, -6]
8 [100441793, 615162271, -331, -961110051, 1708897760, 893268611, -127, -342]
7 [-331, -961110051, 1708897760, 893268611, -127, -342, -6]
7 [615162271, -331, -961110051, 1708897760, 893268611, -127, -342]
6 [-961110051, 1708897760, 893268611, -127, -342, -6]
6 [-331, -961110051, 1708897760, 893268611, -127, -342]
5 [1708897760, 893268611, -127, -342, -6]
5 [-961110051, 1708897760, 893268611, -127, -342]
4 [893268611, -127, -342, -6]
4 [1708897760, 893268611, -127, -342]
3 [-127, -342, -6]
3 [893268611, -127, -342]
2 [-342, -6]
2 [-127, -342]
1 [-6]
1 [-342]
0 []
Tests run: 2, Failures: 1, Errors: 0, Skipped: 0, Time elapsed: 0.21 sec <<< FAILURE! - in com.test.MyPropertyBasedTest
testThatBreaks  Time elapsed: 0.137 sec  <<< FAILURE!
org.junit.ComparisonFailure: expected:<[tru]e> but was:<[fals]e>
    at com.test.MyPropertyBasedTest.testThatBreaks(MyPropertyBasedTest.java:25)


Results :

Failed tests: 
  MyPropertyBasedTest.testThatBreaks:25 expected:<[tru]e> but was:<[fals]e>
```
