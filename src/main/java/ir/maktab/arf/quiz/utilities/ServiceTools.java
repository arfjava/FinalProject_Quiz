package ir.maktab.arf.quiz.utilities;

import ir.maktab.arf.quiz.services.AccountService;
import ir.maktab.arf.quiz.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceTools {

    private static QuizService quizService;
    private static AccountService accountService;

    @Autowired
    private void setQuizService(QuizService quizService){
        ServiceTools.quizService = quizService;
    }

    @Autowired
    private void setAccountService(AccountService accountService){
        ServiceTools.accountService = accountService;
    }



    public static QuizService getQuizService(){
        return ServiceTools.quizService;
    }
    public static AccountService getAccountService(){
        return ServiceTools.accountService;
    }
}
