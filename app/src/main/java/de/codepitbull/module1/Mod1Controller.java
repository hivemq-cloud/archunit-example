package de.codepitbull.module1;

import de.codepitbull.annotations.Controller;
import de.codepitbull.module1.internal.persistence.Persistence;

@Controller
public class Mod1Controller {
    public void doStuff() {
        new Persistence();
    }
}
