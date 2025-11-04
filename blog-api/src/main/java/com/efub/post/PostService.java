package com.efub.post;

import com.efub.domain.Post;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PostService {

    private final EntityManager em;

    @Transactional
    public Post create(Post post){
        em.persist(post);
        return post;
    }

    @Transactional(readOnly = true)
    public Post find(Long id){
        return em.find(Post.class, id);
    }
}
