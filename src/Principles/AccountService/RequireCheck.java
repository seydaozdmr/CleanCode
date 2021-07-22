package Principles.AccountService;

import java.util.function.Predicate;

public class RequireCheck {
    public static void Check(Require<Integer> require,int id){
        if(!require.check(id)){
            throw new IllegalArgumentException("Illegal argument has been passed.");
        }
    }

    public static void CheckPre(Predicate<Integer> predicate){

    }

}
