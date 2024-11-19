import java.io.Serializable;

sealed interface Entity extends Serializable permits Subject, Member{

}