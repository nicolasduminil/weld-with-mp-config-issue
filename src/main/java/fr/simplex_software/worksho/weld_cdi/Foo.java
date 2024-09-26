package fr.simplex_software.worksho.weld_cdi;

import jakarta.annotation.*;
import jakarta.enterprise.context.*;

@ApplicationScoped
public class Foo
{
  private String bar;

  @PostConstruct
  public void init()
  {
    bar = "baz";
  }

  public String getBar()
  {
    return bar;
  }
}