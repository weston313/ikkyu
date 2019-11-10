-- read data from user
users = select * from user where p_date = '2019-10-10';

-- read the first one
select * from users limit 1; -- test

template add test(aa,bb,cc) {

    select * from ${aa} where dt = '${bb}';

}