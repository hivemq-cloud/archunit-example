package de.codepitbull.notamodule;

import de.codepitbull.module1.Mod1Service;
import de.codepitbull.module2.Mod2Service;
import de.codepitbull.module2.internal.Persistence;

public class App {

    public void doStuff() {
        var moddy1 = new Mod1Service();
        var moddy2 = new Mod2Service();

        //This will break var persistence = new Persistence();
    }
}
