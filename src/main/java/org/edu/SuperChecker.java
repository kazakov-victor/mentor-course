package org.edu;

public class SuperChecker {
    public void checkLevel(int level) throws MyCheckException {
        if(level <= 0){
            throw new MyCheckException("Boss! We lost every thing! ",level);
        }
    }
}
