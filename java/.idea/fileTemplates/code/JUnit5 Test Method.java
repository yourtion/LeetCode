@ParameterizedTest()
@MethodSource("testDataProvider")
void ${NAME}(String source, int res) {
  ${BODY}
  System.out.printf("runTest: %s , res: %d", source, res);
  Assertions.assertEquals(res , new Solution());
}