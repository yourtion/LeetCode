import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

#parse("File Header.java")
@DisplayName("")
class ${NAME} {
  static Stream<Arguments> testDataProvider() {
    return Stream.of(
        arguments()
    );
  }
    
  ${BODY}
}