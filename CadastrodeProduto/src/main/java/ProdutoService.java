import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService{
    @Autowired
    private ProdutoRepository produtoRepository;

    public  String cadastrarProduto(Produto produto){
        if (produto.getPreco()> 1000.00){
            produtoRepository.save(produto);
            return "Produto de luxo cadastrado com sucesso";
        }else{
            produtoRepository.save(produto);
            return "Produto cadastrado com sucesso!";
        }

    }

}
