package site.ffrfree;


import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import java.util.Date;

public class TvSeriesDto {
    @Null
    private int id;
    @NotNull
    private String name;
    @DecimalMin("1")
    private int seasonCount;
    @Valid @NotNull @Size(min=2)

    private Date originRelease;

    public TvSeriesDto() {
    }

    public TvSeriesDto(int id, String name, int seasonCount, Date originRelease) {
        this.id = id;
        this.name = name;
        this.seasonCount = seasonCount;
        this.originRelease = originRelease;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeasonCount(int seasonCount) {
        this.seasonCount = seasonCount;
    }

    public void setOriginRelease(Date originRelease) {
        this.originRelease = originRelease;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSeasonCount() {
        return seasonCount;
    }

    public Date getOriginRelease() {
        return originRelease;
    }

    @Override
    public String toString() {
        return "TvSeriesDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", seasonCount=" + seasonCount +
                ", originRelease=" + originRelease +
                '}';
    }
}
