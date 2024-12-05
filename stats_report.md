echo "# Commit Stats Report" > stats_report.md
echo "Generated on $(date)" >> stats_report.md
echo "" >> stats_report.md

# Track commits in the 'src' folder
echo "### Commits in the 'src' folder" >> stats_report.md
git log --oneline -- src/ >> stats_report.md
echo "" >> stats_report.md


echo "### Commits by Author" >> stats_report.md
git shortlog -s -n >> stats_report.md
echo "" >> stats_report.md


echo "### Total Commits" >> stats_report.md
git rev-list --count HEAD >> stats_report.md
echo "" >> stats_report.md
