import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService{
    @Autowired
    private ProdutoRepository produtoRepository;
    private static final Logger logger = (Logger) LoggerFactory.getLogger(ProdutoService.class);

    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }
    public Produto cadastrarProduto(Produto produto){
        Produto produtoSalvo = produtoRepository.save(produto);
        if (produtoSalvo.getPreco()>1000.00){
            logger.info("Produto de luxo cadastrado: ID{}",produtoSalvo.getId());
        }else{
            logger.info("Produto cadastrado:ID{}",produtoSalvo.getId());
        }
        return  produtoSalvo;
    }

}
