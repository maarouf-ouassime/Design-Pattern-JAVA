package org.sid.metier.generatorcode.oldImpl;


import org.sid.metier.ClassDiagram;
import org.sid.metier.generatorcode.CodeGenerator;

public class OldGeneratorAdapter extends
        OldGeneratorImpl implements CodeGenerator {
    @Override
    public String generateCode
            (ClassDiagram diagram) {
        return super.generateCode(diagram);
    }
}

