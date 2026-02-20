
class Livre {
    private String titre;

    public Livre(String titre) {
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public String toString() {
        return titre;
    }
}