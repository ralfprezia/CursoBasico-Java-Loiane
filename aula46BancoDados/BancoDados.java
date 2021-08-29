package deal.Ralf.cursojava.aula46BancoDados;

public interface BancoDados extends SqlDCL, SqlDML, SqlDDL {

    void abrirConexao();
    void fecharConexao();
}
