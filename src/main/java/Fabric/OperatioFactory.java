package Fabric;

import jdk.dynalink.Operation;

public class OperatioFactory implements Fabric.Operation {

    @Override
    public Fabric.Operation getOperation(Fabric.Operation.Type type) {
        return null;
    }
}
