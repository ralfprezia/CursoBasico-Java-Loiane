package deal.Ralf.cursojava.exercicioaula52;

    class AgendaCheiaExeption extends Exception {

    @Override
    public String getMessage() {
        return "Agenda já está cheia";
    }

}