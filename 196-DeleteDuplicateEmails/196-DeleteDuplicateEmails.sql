-- Last updated: 11/08/2026, 19:56:20
delete p1 from person p1,person p2 
where p1.email=p2.email and p1.id>p2.id;