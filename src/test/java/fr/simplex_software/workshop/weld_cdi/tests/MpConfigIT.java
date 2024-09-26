package fr.simplex_software.workshop.weld_cdi.tests;

import fr.simplex_software.worksho.weld_cdi.*;
import jakarta.inject.*;
import org.eclipse.microprofile.config.inject.*;
import org.jboss.weld.junit5.auto.*;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;

@EnableAutoWeld
public class MpConfigIT
{
  @Inject
  @ConfigProperty(name = "base_uri/mp-rest/url")
  String baseURI;

  @Test
  public void testMpConfig()
  {
    assertThat(baseURI).isNotNull();
  }

  @Inject
  private Foo foo;

  @Test
  void testJakartaInject() {
    assertThat(foo).isNotNull();
    assertThat(foo.getBar()).isEqualTo("baz");
  }
}
