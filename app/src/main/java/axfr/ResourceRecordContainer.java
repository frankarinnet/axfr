package axfr;

import org.xbill.DNS.Name;
import org.xbill.DNS.Record;

public interface ResourceRecordContainer<T>
{
    T add( Record r );

    Name getOrigin();
}
