package axfr;

import org.xbill.DNS.Name;
import org.xbill.DNS.Record;
import org.xbill.DNS.Zone;

import java.io.IOException;

public class ZoneFileBuilder extends ZoneBuilder implements ResourceRecordContainer<ZoneFileBuilder>
{
    public ZoneFileBuilder( Name zone ) { super( zone ); }

    public Zone zone()
    {
        try
        {
            return new Zone( zone, records.toArray( new Record[records.size()] ) );
        }
        catch ( IOException e )
        {
            throw new RuntimeException( e );
        }
    }

    public ZoneFileBuilder add( Record record )
    {
        records.add( record );
        return this;
    }
}
