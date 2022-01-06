package adltest.test;

import adl.tester.galah.cat.Cat;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TestAdl {
    @Test
    void deserialize() {
        String json = """
                      {"name":"Dinah-Kah", "age":10}
                      """;
        Cat cat = Cat.jsonBinding().fromJsonString(json);
        assertThat(cat.getName()).isEqualTo("Dinah-Kah");
        assertThat(cat.getAge()).isEqualTo(10);
    }
}
