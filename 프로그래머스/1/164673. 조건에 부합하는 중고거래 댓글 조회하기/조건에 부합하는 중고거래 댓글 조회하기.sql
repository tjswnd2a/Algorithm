-- 코드를 입력하세요
SELECT 
    b.title
    ,a.board_id
    ,a.reply_id
    ,a.writer_id
    ,a.contents
    ,to_char(a.created_date, 'YYYY-MM-DD') as created_date
from
    USED_GOODS_REPLY a
    left outer join USED_GOODS_BOARD b
    on a.board_id = b.board_id

where 1=1
    and to_char(b.created_date, 'YYYYMM') = '202210'
order by a.created_date, b.title

