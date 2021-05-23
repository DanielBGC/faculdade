package a;

/**
http://tutorials.jenkov.com/java/enums.html
https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
https://crunchify.com/why-and-for-what-should-i-use-enum-java-enum-examples/
http://blog.triadworks.com.br/enums-sao-mais-que-constantes
http://www.mauda.com.br/?p=354
http://www.javaprogressivo.net/2012/10/Como-usar-enumA-melhor-maneira-para-manusear-constantes-em-Java.html
http://www.devmedia.com.br/tipos-enum-no-java/25729
PROPRIEDADES

*tem nomes fixos e imutáveis (static final);
* 
*não é permitido criar novas instâncias com a palavra chave new;
* 
*construtor private, embora não precise de modificador private explícito;
* 
*como são constantes e imutáveis (static final), as letras são MAIÚSCULAS;
* 
*opcionalmente, pode incluir variáveis de instância, construtor, métodos de instância, de classe, etc.
* 
* todos os enums herdam impliciitamente de java.lang.Enum (não podem herdar de mais nada)
* 
*enum pode ser comparado com ==, equals e switch case
**/
public enum BCartasEnum {
    //membros: static final; construtor: private
    J(11), Q(12), K(13), A(14);

    public int valorCarta;

    BCartasEnum(int valor) {
        valorCarta = valor;
    }
    
    
}
