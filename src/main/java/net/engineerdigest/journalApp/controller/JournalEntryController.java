/*
 * package net.engineerdigest.journalApp.controller;
 * 
 * import java.util.ArrayList; import java.util.HashMap; import java.util.List;
 * import java.util.Map;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.DeleteMapping; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.PutMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import net.engineerdigest.journalApp.entity.JournalEntry; import
 * net.engineerdigest.journalApp.service.JournalEntryService;
 * 
 * @RestController
 * 
 * @RequestMapping("/journal") public class JournalEntryController {
 * 
 * 
 * Jour
 * 
 * 
 * private Map<Long,JournalEntry> journalEntries = new HashMap<>();
 * 
 * @GetMapping public List<JournalEntry> getAll() { return new
 * ArrayList<>(journalEntries.values());
 * 
 * }
 * 
 * @GetMapping("id/{myId}") public JournalEntry
 * getJournalEntryById(@PathVariable Long myId) { return
 * journalEntries.get(myId); }
 * 
 * @PostMapping public Boolean createEntry(@RequestBody JournalEntry myEntry) {
 * journalEntries.put(myEntry.getId(), myEntry); return true; }
 * 
 * @PutMapping("id/{id}") public JournalEntry
 * updateJournalByIdEntry(@PathVariable Long id, @RequestBody JournalEntry
 * myEntry) { return journalEntries.put(id, myEntry); }
 * 
 * @DeleteMapping("id/{myId}") public JournalEntry
 * deleteJournalById(@PathVariable Long myId) { return
 * journalEntries.remove(myId); } }
 */