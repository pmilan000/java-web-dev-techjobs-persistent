## Part 1: Test it with SQL
SELECT *
FROM employer, skill;

## Part 2: Test it with SQL
SELECT *
FROM employer
WHERE location = St. Louis City;

## Part 3: Test it with SQL
DROP TABLE job
FROM techjobs;

## Part 4: Test it with SQL

SELECT name, description
FROM skill
INNER JOIN job_skills ON skill.skill_id = job.skill_id
ORDER BY name ASC;