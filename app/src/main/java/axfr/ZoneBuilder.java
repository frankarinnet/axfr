package axfr;

import org.xbill.DNS.Name;
import org.xbill.DNS.Record;

import java.util.ArrayList;
import java.util.List;

public class ZoneBuilder
{
    protected final Name zone;
    protected final List<Record> records = new ArrayList<>();

    public ZoneBuilder(Name zone) {
        this.zone = zone;
    }

    public Name getOrigin()
    {
        return zone;
    }

    public List<Record> getRecords()
    {
        return records;
    }

    public static ZoneFileBuilder empty( Name zone )
    {
        return new ZoneFileBuilder( zone );
    }
}
