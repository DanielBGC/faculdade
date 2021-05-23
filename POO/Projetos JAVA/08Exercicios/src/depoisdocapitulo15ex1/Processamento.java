/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depoisdocapitulo15ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author eduardoasilvestre
 */
public class Processamento {

    public Processamento() throws IOException {
        List<Pagamento> pagamentos = this.leArquivo();

        this.geraConteudoRelatorio(pagamentos);

    }

    private List<Pagamento> leArquivo() throws IOException, NumberFormatException {
        String arquivo = "leitura.txt";
        List<Pagamento> pagamentos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String separadas[] = linha.split(" ");

                Pagamento p = new Pagamento();

                p.setId(Long.parseLong(separadas[0]));
                p.setNome(separadas[1]);

                try {
                    p.setValor(new BigDecimal(separadas[2]));
                } catch (NumberFormatException e) {
                    p.setValor(new BigDecimal("90.80"));
                }

                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                try {
                    p.setData(LocalDate.parse(separadas[3], dtf));
                } catch (DateTimeParseException e) {
                    p.setData(LocalDate.parse("14/03/2017", dtf));
                }

                pagamentos.add(p);
            }
        }
        return pagamentos;
    }

    public static void main(String[] args) throws IOException {
        new Processamento();

    }

    public BigDecimal calculaTotalPagamentos(List<Pagamento> pagamentos) {
        BigDecimal totalPagamentos = BigDecimal.ZERO;
        for (Pagamento pagamento : pagamentos) {
            totalPagamentos = totalPagamentos.add(pagamento.getValor());
        }
        return totalPagamentos;
    }

    public String pegaNomePessoaMaiorPagamento(List<Pagamento> pagamentos) {
        Collections.max(pagamentos, new Comparator<Pagamento>() {
            @Override
            public int compare(Pagamento t, Pagamento t1) {
                return t.getValor().compareTo(t1.getValor());
            }
        });
        return pagamentos.get(0).getNome();
    }

    public Map<String, BigDecimal> calculaPagamentosPorPessoa(List<Pagamento> pagamentos) {
        Map<String, BigDecimal> pagamentosPorPessoa = new HashMap<>();

        for (Pagamento pagamento : pagamentos) {

            String nome = pagamento.getNome();
            BigDecimal valor = pagamento.getValor();

            boolean pessoaEstaNoResultado = pagamentosPorPessoa.containsKey(nome);
            if (!pessoaEstaNoResultado) {
                pagamentosPorPessoa.put(nome, valor);

            } else {
                BigDecimal valorAnterior = pagamentosPorPessoa.get(nome);
                valorAnterior = valorAnterior.add(valor);
                pagamentosPorPessoa.put(nome, valorAnterior);
            }

        }
        return pagamentosPorPessoa;
    }

    public Map<String, BigDecimal> calculaPagamentosPorDia(List<Pagamento> pagamentos) {
        Map<String, BigDecimal> pagamentosPorDia = new HashMap<>();

        for (Pagamento pagamento : pagamentos) {
            BigDecimal valor = pagamento.getValor();

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String dataEmString = pagamento.getData().format(dtf);

            boolean diaEstaNoResultado = pagamentosPorDia.containsKey(dataEmString);
            if (!diaEstaNoResultado) {
                pagamentosPorDia.put(dataEmString, valor);

            } else {
                BigDecimal valorAnterior = pagamentosPorDia.get(dataEmString);
                valorAnterior = valorAnterior.add(valor);
                pagamentosPorDia.put(dataEmString, valorAnterior);
            }

        }
        return pagamentosPorDia;
    }

    public void geraConteudoRelatorio(List<Pagamento> pagamentos) throws FileNotFoundException, IOException {

        BigDecimal totalPagamentos = this.calculaTotalPagamentos(pagamentos);
        String nomePessoa = this.pegaNomePessoaMaiorPagamento(pagamentos);
        Map<String, BigDecimal> pagamentosPorDia = this.calculaPagamentosPorDia(pagamentos);
        Map<String, BigDecimal> pagamentosPorPessoa = this.calculaPagamentosPorPessoa(pagamentos);

        OutputStream os = new FileOutputStream("escrita.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        try (BufferedWriter bw = new BufferedWriter(osw)) {
            bw.write("RELATÓRIO DE VENDAS");
            bw.newLine();

            bw.write("O valor de pagamentos registrados no arquivo é: " + totalPagamentos.toString());
            bw.newLine();

            bw.write("A pessoa que pagou o maior valor foi: " + nomePessoa);
            bw.newLine();
            bw.newLine();

            bw.write("O valor total de pagamentos agrupado por pessoa é:");
            bw.newLine();
            for (Map.Entry<String, BigDecimal> entry : pagamentosPorPessoa.entrySet()) {
                String key = entry.getKey();
                BigDecimal value = entry.getValue();
                bw.write(key + "\t" + value);
                bw.newLine();

            }
            bw.newLine();
            bw.write("O valor total de pagamentos agrupado por dia é:");
            bw.newLine();
            for (Map.Entry<String, BigDecimal> entry : pagamentosPorDia.entrySet()) {
                String key = entry.getKey();
                BigDecimal value = entry.getValue();
                bw.write(key + "\t" + value);
                bw.newLine();

            }
        }

    }
}
