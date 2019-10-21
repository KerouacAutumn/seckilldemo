package cn.waqwb.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author JokerQ
 * @date 2019/10/12 - 18:35
 */
public interface UserESRepository extends ElasticsearchRepository<UserES,Long> {
}
