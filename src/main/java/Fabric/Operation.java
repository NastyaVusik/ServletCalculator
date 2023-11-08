package Fabric;

import java.lang.reflect.Type;

public interface Operation {
    Operation getOperation(Operation.Type type);

     enum Type{
         SUM,
         SUB,
         DIV
     }
}
