class Bob {

    String hey(String msg) {
        msg = msg.trim();
        if (msg.toUpperCase() == msg && msg.toLowerCase() != msg) {
            return "Whoa, chill out!";
        } else if (msg.endsWith("?")) {
            return "Sure.";
        } else if (msg.isEmpty()) {
            return "Fine. Be that way!";
        } else {
            return "Whatever.";
        }
    }
}
