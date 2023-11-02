package SOLID_2;

public class OperationService {
    private final OperationStorage operationStorage = new OperationStorage();
    public double process(Operation operation){
        Operation res = operation.process();
        operationStorage.save(res);
        return operation.getResult();
    }
}
