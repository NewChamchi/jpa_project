package Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@ToString
public abstract class BaseEntity {

    private String createBy;

    private LocalDateTime createDate;

    private String modifiedBy;

    private LocalDateTime modifiedDate;

}
