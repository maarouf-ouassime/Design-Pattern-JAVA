package org.sid.metier;
import org.sid.metier.generatorcode.CodeGenerator;
import org.sid.metier.generatorcode.JavaCodeGeneratorImpl;
import org.sid.metier.exportdiagramme.DiagramExporter;
import org.sid.metier.exportdiagramme.SVGExp;
import org.sid.metier.entities.Entity;
import org.sid.metier.relations.Relation;

import java.util.ArrayList;
import java.util.List;
public class ClassDiagram {
    CodeGenerator codeGenerator = new JavaCodeGeneratorImpl();
    DiagramExporter diagramExporter = new SVGExp();
    List<Entity> entities = new ArrayList<>();
    List<Relation> relations = new ArrayList<>();

    String generateCode(){
        return codeGenerator.generateCode(this);
    }
    void exportDiagram(){
        this.diagramExporter.exportDiagram(this);
    }
    public void setDiagramExporter(DiagramExporter diagramExporter) {
        this.diagramExporter = diagramExporter;
    }
    public void setCodeGenerator(CodeGenerator codeGenerator) {
        this.codeGenerator = codeGenerator;
    }
}
