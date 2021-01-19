# xml-conformance

This project is intended to be used as conformance test for any XML parser library. Currently, only plexus-utils 's MXParser pull parser is supported.

The tests are generated from the official "XML W3C Conformance Test Suite 20130923"(https://www.w3.org/XML/Test/)

To re-generate the Java tests: mvn -Pgenerate-tests-mxparser clean test

Enjoy!
Gabriel
