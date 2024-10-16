public record Moneda(String result,
                     String documentation,
                     String terms_of_use,
                     double time_last_update_unix,
                     String time_last_update_utc,
                     double time_next_update_unix,
                     String time_next_update_utc,
                     String base_code,
                     String target_code,
                     double conversion_rate,
                     double conversion_result) {
    @Override
    public String toString() {
        return "["+this.base_code+"]"+" corresponde al valor final de =>>> "+this.conversion_result+"["+this.target_code+"]";
    }
}
