package org.edu;

public class SimpleExample{
    public void checkInt(int level) throws MyUncheckException {
        if(level > 3){
            throw new MyUncheckException("It is too many! Value", level);
        }
    }
}
