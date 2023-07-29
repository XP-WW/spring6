package proxy.service;

/**
 * @author 苏禾
 * @version 1.0
 * @title OrderService
 * @description 订单业务接口
 * @create 2023/7/29 16:14
 * @since 1.0
 **/
public interface OrderService {
    void generate();
    void modify();
    void detail();
    String getName();
}
