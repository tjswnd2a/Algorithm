SELECT * 
FROM (
    SELECT
        USER_ID,
        NICKNAME,
        SUM(PRICE) AS TOTAL_SALES
    FROM
        USED_GOODS_BOARD a
        left outer join USED_GOODS_USER b
        ON a.WRITER_ID = b.USER_ID
    where 1=1
        and a.status = 'DONE'
    group by USER_ID, NICKNAME
    )T
    WHERE 1=1 
    AND T.TOTAL_SALES >= 700000
    order by T.TOTAL_SALES asc