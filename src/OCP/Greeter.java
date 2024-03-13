package OCP;

interface Formality {
    public String say();
}

class Formal implements Formality {
    @Override
    public String say() {
        return "Good evening, sir.";
    }
}

class Casual implements Formality {
    @Override
    public String say() {
        return "Sup bro?";
    }
}

class Intimate implements Formality {
    @Override
    public String say() {
        return "Hello Darling!";
    }
}

class MZ implements Formality {
    @Override
    public String say() {
        return "....";
    }
}

class Normal implements Formality {
    @Override
    public String say() {
        return "Hello.";
    }
}

public class Greeter {
    Formality formality;

    public String greet() {
        return formality.say();
    }

    public void setFormality(Formality formality) {
        this.formality = formality;
    }
}