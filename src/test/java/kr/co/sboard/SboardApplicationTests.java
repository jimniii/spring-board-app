package kr.co.sboard;

import jakarta.transaction.Transactional;
import kr.co.sboard.entity.Article;
import kr.co.sboard.repository.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class SboardApplicationTests {

    @Autowired
    private ArticleRepository articleRepository;

    @Test
    void contextLoads() {

    }

    @Test
    @Transactional
    void test2(){

        Optional<Article> optArticle = articleRepository.findById(23049);

        if(optArticle.isPresent()){
            Article article = optArticle.get();
            System.out.println(article);
        }
    }

}





