package ir.maktab.arf.quiz.services;

import ir.maktab.arf.quiz.entities.Quiz;
import ir.maktab.arf.quiz.repositories.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizService {

    @Autowired
    QuizRepository quizRepository;

    public Quiz save(Quiz quiz){
        return quizRepository.save(quiz);
    }

    public Quiz findById(Long id){
        return quizRepository.findById(id).get();
    }

    public void removeById(Long id){
        quizRepository.deleteById(id);
    }
}
