package net.nazarsit.arq.base;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;

public class BaseArquillianIT {

    public static WebArchive createBaseDeployment(){
        var assertJ = "org.assertj:assertj-core:3.10.0";

        final var pomEquippedResolveStage =
                Maven.resolver().loadPomFromFile("pom.xml");

        return ShrinkWrap.create(WebArchive.class)
                .addClasses(
                        BaseArquillianIT.class
                )
                .addAsLibraries(pomEquippedResolveStage.resolve(assertJ).withTransitivity().asFile());
    }


}
