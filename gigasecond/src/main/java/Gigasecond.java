import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    LocalDateTime start;

    Gigasecond(LocalDate birthDate) {
        start = birthDate.atStartOfDay();
    }

    Gigasecond(LocalDateTime birthDateTime) {
        start = birthDateTime;
    }

    LocalDateTime getDate() {
        return start.plusSeconds(1_000_000_000);
    }

}
