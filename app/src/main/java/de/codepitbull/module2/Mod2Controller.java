package de.codepitbull.module2;

import de.codepitbull.annotations.Controller;
import de.codepitbull.module2.internal.Persistence;

@Controller
public class Mod2Controller {
    public void doStuff() {
        new Persistence();
    }
}
